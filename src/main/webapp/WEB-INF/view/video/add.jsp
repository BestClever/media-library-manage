<%--
  Created by IntelliJ IDEA.
  User: BestClever
  Date: 2020-07-02 0002
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common/tag.jsp" %>
<head>
    <meta charset="UTF-8">
    <title>用户添加</title>
    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css" media="all">
</head>
<body>
<form class="layui-form" action="" lay-filter="addForm" style="margin-top: 30px">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">编号</label>
            <div class="layui-input-block">
                <input type="text" name="videoId" required lay-verify="videoId|required" autocomplete="off"
                       placeholder="请输入编号"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-block">
                <input type="text" name="videoTitle" id="videoTitle" autocomplete="off" placeholder="请输入标题"
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
                <select name="videoLevel" lay-filter="bookLevel">
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
            <label class="layui-form-label">出品者名字</label>
            <div class="layui-input-block">
                <input type="text" name="producerName" autocomplete="off" placeholder="请输入出品者名字"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">出品年份</label>
            <div class="layui-input-block">
                <input type="text" name="producerYear" id="producerYear" autocomplete="off" placeholder="YYYY"
                       class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">视频时长</label>
            <div class="layui-input-block">
                <input type="text" name="videoTime" autocomplete="off" placeholder="请输入视频时长"
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
    layui.use(['form', 'jquery', 'element', 'layer', 'laydate'], function () {
        var element = layui.element;
        $ = layui.jquery,
            layer = layui.layer,
            laydate = layui.laydate,
            form = layui.form;

        laydate.render({
            elem: '#producerYear'
            ,type: 'year'
        });

        form.verify({
            videoId: function (value) {

                var url = BaseUrl + "video/findByVideoId";
                var param = {
                    videoId: value
                }
                var returnMsg = '';
                $.ajax({
                    url: url,
                    type: "get",
                    async: false,
                    data: param,
                    dataType: "json",
                    success: function (result) {
                        if (result.success) {
                            if (result.code === 1200) {
                                returnMsg = "不能添加重复的编号";
                            }
                        } else {
                            returnMsg = "服务器异常";
                        }
                    }
                });
                if (returnMsg) {
                    return returnMsg;
                }

            }
        });

        form.on('submit(add)', function (data) {
            var url = BaseUrl + "video/save";
            //
            $.post(url, data.field, function (result) {
                if (result.success) {
                    layer.msg(result.msg, function () {
                        parent.layer.close(parent.layer.getFrameIndex(window.name));
                    })
                } else {
                    layer.msg(result.msg)
                    return;
                }
            }, 'json');

            return false;
        });
    });
</script>
</body>
</html>
