<%--
  Created by IntelliJ IDEA.
  User: BestClever
  Date: 2020-07-02 0002
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common/tag.jsp" %>
<html>
<head>
    <title>图书编辑</title>
    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css" media="all">
</head>
<body>
<form class="layui-form" action="" lay-filter="editForm" style="margin-top: 30px">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">编号</label>
            <div class="layui-input-block">
                <input type="text" name="bookId" autocomplete="off" readonly disabled placeholder="请输入编号"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-block">
                <input type="text" name="bookTitle" id="bookTitle" autocomplete="off" placeholder="请输入标题"
                       class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">作者</label>
            <div class="layui-input-block">
                <input type="text" name="bookAuthor" autocomplete="off" placeholder="请输入作者"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">评级</label>
            <div class="layui-input-block">
                <%--<input type="text" name="bookLevel" autocomplete="off" placeholder="请输入评级"--%>
                <%--class="layui-input">--%>
                <select name="bookLevel" lay-filter="bookLevel">
                    <option value="0">未评级</option>
                    <option value="1">一般</option>
                    <option value="2">成人</option>
                    <option value="3">儿童</option>
                </select>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">出版社</label>
            <div class="layui-input-block">
                <input type="text" name="bookPublisher" autocomplete="off" placeholder="请输入出版社"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">ISBN号</label>
            <div class="layui-input-block">
                <input type="text" name="isbnNo" autocomplete="off" placeholder="请输入ISBN号"
                       class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">页数</label>
            <div class="layui-input-block">
                <input type="text" name="pageCount" autocomplete="off" placeholder="请输入页数"
                       class="layui-input">
            </div>
        </div>

    </div>

    <div class="layui-form-item" style="margin-left: 110px">
        <div class="layui-input-block">
            <butaton class="layui-btn" lay-submit lay-filter="add">立即提交</butaton>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="${baseurl}/lib/layui/layui.js" charset="utf-8"></script>
<script>
    var initData;

    function initForm(data) {
        var jsonString = JSON.stringify(data);
        initData = JSON.parse(jsonString);
    }


    layui.use(['form', 'jquery', 'element', 'layer','laydate'], function () {
        var element = layui.element;
        $ = layui.jquery,
            layer = layui.layer,
            laydate = layui.laydate,
            form = layui.form;

        form.val("editForm", initData);

        form.on('submit(add)', function (data) {
            var url = BaseUrl+"/book/update";
            //
            $.post(url,data.field,function (result) {
                if(result.success){
                    layer.msg(result.msg,function () {
                        parent.layer.close(parent.layer.getFrameIndex(window.name));
                    })
                }else {
                    layer.msg(result.msg)
                    return;
                }
            },'json');

            return false;
        });
    });
</script>
</body>
</html>
