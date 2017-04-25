<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/7
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax上传</title>
    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/jquery.form.js"></script>
</head>
<body>
    <form id="myform" action="${pageContext.request.contextPath}/">
        <input type="file" name="pictureName" id="picture">
        <img id='imgSrc' src=''  height="100" width="100" />
    </form>
</body>
</html>
<script>
    $("#picture").on("change",function(){
        var option = {
            type:'POST',
            url:'${pageContext.request.contextPath }/upload/picture',
            dataType:'text',
            data:{
                fileName : 'pictureName'
            },
            success:function(data){

                //把json格式的字符串转换成json对象
                var jsonObj = $.parseJSON(data);
                //返回服务器图片路径，把图片路径设置给img标签
                $("#imgSrc").attr("src",jsonObj.fullPath);
            }

        };

        $("#myform").ajaxSubmit(option);
    })
</script>
