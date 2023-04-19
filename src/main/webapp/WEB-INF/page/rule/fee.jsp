<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="author" content="Yu Weiyi 于魏祎 yu_weiyi@outlook.com">

    <!-- Layui -->
    <link href="/layui/css/layui.css" rel="stylesheet">
    <script src="/layui/layui.js"></script>
    <!-- jQuery -->
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <title>邮易 YoE 仓储物流 费用规则</title>
    <link rel="icon" href="/static/image/pure_logo_YoE.png">

    <script type="text/javascript" charset="UTF-8" src="/static/js/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/css/body.css">
    <link rel="stylesheet" type="text/css" href="/static/css/font.css">
    <link rel="stylesheet" type="text/css" href="/static/css/heimu.css">

    <script>
      $(function(){
        $(".header").load("/static/component/header.html");
        $(".footer").load("/static/component/footer.html");
      });
    </script>
  </head>
  <body>
    <div class="header"></div>
    <div class="layui-body font-SmileySans" style="color: #dddddd; left: 0px;">
      <div class="layui-container" align="center">
        <div class="layui-row" style="height: 20px"></div>
        <hr class="layui-border-green">
        <div class="layui-row" style="width: 50%">
          <h2 class="layui-bg-blue">费用规则</h2>
        </div>
        <div class="layui-row" style="height: 60px"></div>
        <blockquote class="layui-elem-quote layui-font-20 layui-font-black">测试阶段，一律五元。</blockquote>
        <div class="layui-row" style="height: 20px"></div>
        <hr class="layui-border-green">
        <div class="layui-row" style="height: 60px"></div>
      </div>
      <div class="layui-row" style="height: 10px"></div>
    </div>
    <div class="footer"></div>
  </body>
</html>
