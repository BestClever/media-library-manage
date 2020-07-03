<%--
  Created by IntelliJ IDEA.
  User: BestClever
  Date: 2020-07-03 0003
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common/tag.jsp" %>
<html>
<head>
    <title>主页面</title>
    <link rel="stylesheet" href="${baseurl}/lib/layui/css/layui.css" media="all"/>
</head>
<body style="padding: 20px; background-color: #F2F2F2;">
<div class="layui-row layui-col-space15">
    <div class="layui-col-md12">
        <div class="layui-card">

            <div class="layui-card-body" style="margin-left: 33%;">
                <h1>欢迎使用媒体库管理系统</h1>
            </div>
        </div>
    </div>
    <div class="layui-col-md12">
        <div class="layui-card">
            <div class="layui-card-header">当前物品库中总物品数:</div>
            <div class="layui-card-body" style="text-align: center;">
                <h3 id="allCount">100</h3>
            </div>
        </div>
    </div>
    <div class="layui-col-md4">
        <div class="layui-card">
            <div class="layui-card-header">图书总数：</div>
            <div class="layui-card-body" style="text-align: center;">
                <h3 id="bookCount">100</h3>
            </div>
        </div>
    </div>
    <div class="layui-col-md4">
        <div class="layui-card">
            <div class="layui-card-header">视频光盘总数：</div>
            <div class="layui-card-body" style="text-align: center;">
                <h3 id="videoCount">100</h3>
            </div>
        </div>
    </div>
    <div class="layui-col-md4">
        <div class="layui-card">
            <div class="layui-card-header">图画总数：</div>
            <div class="layui-card-body" style="text-align: center;" >
                <h3 id="pictureCount">100</h3>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="${baseurl}/lib/layui/layui.js"></script>
<script>
    layui.use(['form', 'element','jquery'], function () {
        var form = layui.form,
            element = layui.element;
        $ = layui.$;
        layer = parent.layer === undefined ? layui.layer : top.layer;

        var url = BaseUrl+"indexData";
        $.get(url,function (result) {
            if (result.success) {
                if (result.code === 1200) {
                    $("#allCount").text(result.data.allCount);
                    $("#bookCount").text(result.data.bookCount);
                    $("#videoCount").text(result.data.videoCount);
                    $("#pictureCount").text(result.data.pictureCount);
                }
            } else {
                returnMsg = "服务器异常";
            }
        },'json');
    });
</script>
</body>
</html>
