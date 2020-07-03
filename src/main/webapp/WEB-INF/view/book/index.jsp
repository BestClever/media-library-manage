<%--
  Created by IntelliJ IDEA.
  User: BestClever
  Date: 2020-07-02 0002
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common/tag.jsp" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${baseurl}/css/common.css" media="all"/>
</head>
<body style="margin-top: 10px">

<blockquote class="layui-elem-quote quoteBox">
    <form class="layui-form">
        <div class="layui-inline">
            <label class="layui-form-label">标题：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="bookTitle" placeholder="请输入搜索的内容"/>
            </div>
        </div>
        <div class="layui-inline">

            <label class="layui-form-label">编号：</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" name="bookId" placeholder="请输入搜索的内容"/>
            </div>
        </div>
        <a class="layui-btn search_btn" lay-submit="" lay-filter="search">查询</a>
    </form>
</blockquote>

<table id="tableId" lay-filter="tableFilter"></table>

<script type="text/javascript" src="${baseurl}/lib/layui/layui.js"></script>
<script>
    layui.use(["element", "jquery", "table", "form", "laydate"], function () {
        var table = layui.table;
        var form = layui.form;
        var laydate = layui.laydate;
        var $ = layui.jquery;

        var talbeInstance = table.render({
            elem: '#tableId',
            url: BaseUrl+"book/list",
            limit: 20,
            page: true,
            toolbar: true,
            toolbar: "#toolbarTpl",
            size: "sm",
            cols: [[
                {field: "bookId", title: "编号"},
                {field: "bookTitle", title: "标题"},
                {field: "bookAuthor", title: "作者"},
                {field: "bookLevel", title: "评级", templet: "#levelTpl"},
                {field: "bookPublisher", title: "出版社"},
                {field: "isbnNo", title: "ISBN号"},
                {field: "pageCount", title: "页数"},
                {title: "操作", width: 150, align: "center", fixed: "right", templet: "#operationTpl"}
            ]],
            done: function (res, curr, count) {
                console.info(res, curr, count);
            }
        });

        form.on("submit(search)", function (data) {
            talbeInstance.reload({
                where: data.field,
                page: {curr: 1}
            });
            return false;
        });
        table.on("toolbar(tableFilter)", function (obj) {
            var data = obj.data;
            switch (obj.event) {
                case "add":
                    add(data);
                    break;
            }
        })

        table.on("tool(tableFilter)", function (obj) {
            var data = obj.data;
            switch (obj.event) {
                case "edit":
                    edit(data);
                    break;
                case "del":
                    del(data);
                    break;
            }
        });

        function add(data) {
            layer.open({
                title: "添加图书",
                type: 2,
                area: ['700px', '450px'],
                fixed: false, //不固定
                maxmin: true,
                content: BaseUrl+'/book/add',
                success: function (layero) {
                    var iframeWin = window[layero.find("iframe")[0]["name"]];
                },
                end: function () {
                    //刷新页面
                    talbeInstance.reload();
                }
            });
        }

        function edit(data) {
            layer.open({
                title: "修改用户",
                type: 2,
                area: ['700px', '450px'],
                fixed: false, //不固定
                maxmin: true,
                content: BaseUrl+'book/edit',
                success: function (layero) {
                    var iframeWin = window[layero.find("iframe")[0]["name"]];
                    iframeWin.initForm(data);
                },
                end: function () {
                    //刷新页面
                    talbeInstance.reload();
                }
            });
        }

        function del(data) {
            var params ={
                bookId:data.bookId
            }
            layer.confirm('您是是否确认删除？', {
                btn: ['确定','取消'] //按钮
            }, function(){
                $.post(BaseUrl+'book/delete', params, function (result) {
                    if (result.success) {
                        layer.msg(result.msg,function () {
                            talbeInstance.reload();
                        });
                    }else {
                        layer.msg(result.msg);
                    }
                });
            });
        }

    });
</script>
<!-- 头工具栏模板 -->
<script type="text/html" id="toolbarTpl">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="add">添加图书</button>
    </div>
</script>

<!-- 行工具栏模板 -->
<script type="text/html" id="operationTpl">
    <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
    <a class="layui-btn layui-btn-xs" lay-event="del">删除</a>
</script>
<%--评级--%>
<script type="text/html" id="levelTpl">
    {{#  if(d.bookLevel == 0){ }}
    <span class="layui-btn layui-btn-normal layui-btn-xs">未评级</span>
    {{#  } else if(d.bookLevel == 1) { }}
    <span class="layui-btn layui-btn-normal layui-btn-xs">一般</span>
    {{#  } else if(d.bookLevel == 2) { }}
    <span class="layui-btn layui-btn-normal layui-btn-xs">成人</span>
    {{#  } else if(d.bookLevel == 3) { }}
    <span class="layui-btn layui-btn-normal layui-btn-xs">儿童</span>
    {{#  } }}
</script>

</body>
</html>
