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

    <title>邮易 YoE 仓储物流 首页</title>
    <link rel="icon" href="/static/image/pure_logo_YoE.png">

    <script type="text/javascript" charset="UTF-8" src="/static/js/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/css/body.css">
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
    <div class="layui-body" style="color: #dddddd; left: 0px;">
      <div class="layui-row" style="height: 10px"></div>
      <div class="layui-carousel" id="home_carousel">
        <div carousel-item>
          <div><img src="static/image/carousel_1.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_2.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_3.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_4.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_5.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_6.jpg" style="width: 100%; height: auto;"/></div>
          <div><img src="static/image/carousel_7.jpg" style="width: 100%; height: auto;"/></div>
        </div>
      </div>
      <div class="layui-container layui-font-black" align="center">
        <div class="layui-row" style="height: 10px"></div>
        <hr class="layui-border-green">
        <div class="layui-row" style="width: 50%">
          <h2 class="layui-bg-blue">业  务  介  绍</h2>
        </div>
        <div class="layui-row" style="height: 20px"></div>
        <div class="layui-row">
          <div class="layui-col-md6">
            <img src="/static/image/country.jpg" style="width: 60%; height: auto;">
          </div>
          <div class="layui-col-md6>">
            <fieldset class="layui-elem-field layui-font-18" align="left">
              <legend>国内业务</legend>
              <div class="layui-field-box">
                邮易YoE拥有首屈一指的航空和陆路运输网络以及高效发达的邮递处理中心，国内范围通达全覆盖，并拥有多种不同的快递产品和增值服务，满足客户多样化、个性化的寄件需求。
              </div>
            </fieldset>
          </div>
        </div>
        <div class="layui-row" style="height: 60px"></div>
        <div class="layui-row">
          <div class="layui-col-md6" >
            <fieldset class="layui-elem-field layui-font-18" align="left">
              <legend>国际业务</legend>
              <div class="layui-field-box">
                邮易YoE国际为用户提供全球200多个国家和地区的寄递服务。根据不同产品，提供信息查询、邮件保价、延误赔偿和丢失赔偿等增值服务，以满足用户寄递物品、文件资料和信件等不同类型的需求。
              </div>
            </fieldset>
          </div>
          <div class="layui-col-md6">
            <img src="/static/image/international.jpg" style="width: 60%; height: auto;">
          </div>
        </div>
        <hr class="layui-border-green">
        <div class="layui-row" style="width: 50%">
          <h2 class="layui-bg-blue">行  业  解  决  方  案</h2>
        </div>
        <div class="layui-row" style="height: 20px"></div>
        <div class="layui-collapse" align="left" style="width: 80%">
          <div class="layui-colla-item">
            <h3 class="layui-colla-title">快消品行业</h3>
            <div class="layui-colla-content layui-show">
              YoE重点关注食品、酒水、连锁、化妆品、家居、烟草子行业。依托物流资源和网络优势，满足快消行业客户季节性运作需求。为您提供供应链全环节物流服务，包括：整车运输、 零担运输、仓储快递服务，并针对快消子行业 客户的不同的物流需求，可以为您提供恒温仓储、冷链运输等定制化物流服务，提供具有市场竞争力的物流服务。
            </div>
          </div>
          <div class="layui-colla-item">
            <h3 class="layui-colla-title">医药行业</h3>
            <div class="layui-colla-content layui-show">
              依托YoE全国物流网络，为药品制造和经销企业提供西药、中成药、医疗器械等物流服务，并可根据客户需求实现整车直送、零担快递、全环节的控温、恒温冷链物流服务，确保药品的全程时限和安全保障。
            </div>
          </div>
          <div class="layui-colla-item">
            <h3 class="layui-colla-title">高科技行业</h3>
            <div class="layui-colla-content layui-show">
              YoE以专注行业服务经验及资源整合能力，为您提供供应链端到端服务，包括仓储、运输配送、流通加工和装卸搬运等增值服务、供应链金融、网络规划和供应链设计等，帮助您降低运作成本与资金，让您致力于自身核心竞争力的发展。
            </div>
          </div>
          <div class="layui-colla-item">
            <h3 class="layui-colla-title">汽车行业</h3>
            <div class="layui-colla-content layui-show">
              YoE专注于为知名品牌的汽车零部件供应商及主机厂提供仓储到运输全供应链物流服务。针对客户的不同运作模式量身定做符合客户战略发展的一体化运作、供应链规划方案，服务产品涉及入厂物流、售后零部件物流、专业的仓储管理。
            </div>
          </div>
          <div class="layui-colla-item">
            <h3 class="layui-colla-title">鞋服行业</h3>
            <div class="layui-colla-content layui-show">
              YoE基于鞋服企业遍布全国的实体店及网络销售需求，结合行业季节性需求及高流动性特点，为您量身打造具有竞争力的全供应链物流解决方案，快速响应您在原材料运输、成品配送、门店调拨、退货、电子商务等方面的需求。
            </div>
          </div>
        </div>
<%--        <hr class="layui-border-green">--%>
<%--        <div class="layui-row" style="width: 50%">--%>
<%--          <h2 class="layui-bg-blue">新  闻  资  讯</h2>--%>
<%--        </div>--%>
<%--        <fieldset class="layui-elem-field" align="left" style="width: 80%">--%>
<%--          <legend>TD-SCDMA</legend>--%>
<%--          <div class="layui-field-box">--%>
<%--            <span class="heimu" title="你知道的太多了">《重 邮 圣 经》</span>2005年10月9日下午2:30，重庆市人民政府新闻办公室在重庆市新闻发布中心举行了新闻发布会。会议郑重发布了“世界第一颗0.13微米工艺的TD-SCDMA 3G手机核心芯片在重庆诞生”这一令国人自豪和骄傲的重大喜讯。重庆市人民政府新闻办和重庆邮电学院在此间联合宣布：具有我国自主知识产权的世界首枚“通芯一号”3G手机核心芯片已由重庆重邮信科股份有限公司（简称重邮信科）研发成功，并向媒体人士展示亮相。这是世界上第一枚0.13微米工艺的TD-SCDMA 3G手机基带芯片。它的诞生，标志着我国3G通信核心芯片等关键技术已达到了世界领先水平。实现了从“中国制造”到“中国创造”的跨越。--%>
<%--          </div>--%>
<%--        </fieldset>--%>
        <hr class="layui-border-green">
      </div>
      <div class="layui-row" style="height: 10px"></div>
    </div>
    <div class="footer"></div>
  </body>
</html>
