/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-24 12:27:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"showError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script id=\"allmobilize\" charset=\"utf-8\" src=\"style/js/allmobilize.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"alternate\" media=\"handheld\"  />\r\n");
      out.write("<!-- end 云适配 -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>大学生兼职平台</title>\r\n");
      out.write("<meta property=\"qc:admins\" content=\"23635710066417756375\" />\r\n");
      out.write("<meta content=\"大学生兼职平台\" name=\"description\">\r\n");
      out.write("<meta content=\"大学生兼职平台\" name=\"keywords\">\r\n");
      out.write("<meta name=\"baidu-site-verification\" content=\"QIQ6KC1oZ6\" />\r\n");
      out.write("\r\n");
      out.write("<!-- <div class=\"web_root\"  style=\"display:none\">h</div> -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var ctx = \"h\";\r\n");
      out.write("console.log(1);\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"Shortcut Icon\" href=\"h/images/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/external.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/css/popup.css\"/>\r\n");
      out.write("<script src=\"style/js/jquery.1.10.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/jquery.lib.min.js\"></script>\r\n");
      out.write("<script src=\"style/js/ajaxfileupload.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/additional-methods.js\"></script>\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"style/js/excanvas.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<style>\r\n");
      out.write("  .con{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    width:200px;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var youdao_conv_id = 271546;\r\n");
      out.write("var email = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var type = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("$.ajax({\r\n");
      out.write("    type:\"post\",\r\n");
      out.write("    url:\"allResume\",\r\n");
      out.write("    data:{},\r\n");
      out.write("    dataType:\"json\",\r\n");
      out.write("    success:function(response){\r\n");
      out.write("        obj = response.list;\r\n");
      out.write("        var html = \"\";\r\n");
      out.write("         for(var i = 0;i<obj.length;i++){\r\n");
      out.write("            html+='<li class=\"odd clearfix\" style=\"width:750px;margin-top:8px;\"><div class=\"hot_pos_l\" ><div class=\"mb10\"><a href=\"applyRe?id='+obj[i].id+'\" target=\"_blank\" style=\"text-decoration:blink \">'\r\n");
      out.write("            +obj[i].jobName+'</a></div><div style=\"float:left;\"><span><em class=\"c7\">兼职类型： </em>'\r\n");
      out.write("            +obj[i].jobName+'</span> <br /><span><em class=\"c7\">人数：</em>'\r\n");
      out.write("            +obj[i].number+'</span></div><div style=\"float:left;\"><span class=\"con\"><em class=\"c7\">时间：</em>'\r\n");
      out.write("            +obj[i].time+'</span><br /><span class=\"con\"><em class=\"c7\">地点：</em>'\r\n");
      out.write("            +obj[i].department+'</span></div></div><div class=\"hot_pos_r\" style=\"width:350px;\"><div class=\"apply\" style=\"margin-top:25px;\"><a href=\"applyRe?id='+obj[i].id+'\" target=\"_blank\"  style=\"width:120px;height:40px;text-align:center;line-height:40px;\">报名参加</a></div><div class=\"mb10\" style=\"margin-top:35px;margin-left:30px;\"><span><em class=\"c7\">报酬： </em>'\r\n");
      out.write("            +obj[i].salary+'</span></div></div></li>'\r\n");
      out.write("         }\r\n");
      out.write("         $(\"#allRe\").html(html);\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(\"dl dd a,#search_button\").click(function(){\r\n");
      out.write("var key = $(this).text();\r\n");
      out.write("if(key.length==0){\r\n");
      out.write("key = $(\"#search_input\").val();\r\n");
      out.write("}\r\n");
      out.write("$.ajax({\r\n");
      out.write("    type:\"post\",\r\n");
      out.write("    url:\"findResumeByName\",\r\n");
      out.write("    data:{jobName:key},\r\n");
      out.write("    dataType:\"json\",\r\n");
      out.write("    success:function(response){\r\n");
      out.write("     obj = response.list;\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("             for(var i = 0;i<obj.length;i++){\r\n");
      out.write("                html+='<li class=\"odd clearfix\" style=\"width:750px;margin-top:8px;\"><div class=\"hot_pos_l\" ><div class=\"mb10\"><a href=\"applyRe?id='+obj[i].id+'\" target=\"_blank\" style=\"text-decoration:blink \">'\r\n");
      out.write("                +obj[i].jobName+'</a></div><div style=\"float:left;\"><span><em class=\"c7\">兼职类型： </em>'\r\n");
      out.write("                +obj[i].jobName+'</span> <br /><span><em class=\"c7\">人数：</em>'\r\n");
      out.write("                +obj[i].number+'</span></div><div style=\"float:left;\"><span class=\"con\"><em class=\"c7\">时间：</em>'\r\n");
      out.write("                +obj[i].time+'</span><br /><span class=\"con\"><em class=\"c7\">地点：</em>'\r\n");
      out.write("                +obj[i].department+'</span></div></div><div class=\"hot_pos_r\" style=\"width:350px;\"><div class=\"apply\" style=\"margin-top:25px;\"><a href=\"applyRe?id='+obj[i].id+'\" target=\"_blank\" style=\"width:120px;height:40px;text-align:center;line-height:40px;\">报名参加</a></div><div class=\"mb10\" style=\"margin-top:35px;margin-left:30px;\"><span><em class=\"c7\">报酬： </em>'\r\n");
      out.write("                +obj[i].salary+'</span></div></div></li>'\r\n");
      out.write("             }\r\n");
      out.write("             $(\"#allRe\").html(html);\r\n");
      out.write("    }\r\n");
      out.write("})\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/conv.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("    \t<div class=\"wrapper\">\r\n");
      out.write("    \t\t<a href=\"index\" class=\"logo\">\r\n");
      out.write("    \t\t\t<img src=\"style/images/logo5.png\" width=\"229\" height=\"43\" alt=\"大学生兼职平台\" />\r\n");
      out.write("    \t\t</a>\r\n");
      out.write("    \t\t<ul class=\"reset\" id=\"navheader\">\r\n");
      out.write("    \t\t\t<li class=\"current\"><a href=\"index.jsp\">首页</a></li>\r\n");
      out.write("    \t\t\t");
 if(session.getAttribute("type")!=null) { 
      out.write("\r\n");
      out.write("    \t\t\t");
if(session.getAttribute("type").equals("company")){
      out.write("\r\n");
      out.write("    \t\t\t<li ><a href=\"comIndex.jsp\" rel=\"nofollow\">公司主页</a></li>\r\n");
      out.write("    \t\t\t<li ><a href=\"create.jsp\" rel=\"nofollow\">兼职</a></li>\r\n");
      out.write("    \t\t\t");
} else if(session.getAttribute("type").equals("student")){
      out.write("\r\n");
      out.write("    \t\t\t<li ><a href=\"delivery.jsp\" rel=\"nofollow\">报名</a></li>\r\n");
      out.write("    \t\t\t<li ><a href=\"stuResume.jsp\" rel=\"nofollow\">简历</a></li>\r\n");
      out.write("    \t\t\t<li><a rel=\"nofollow\" target=\"_blank\" href=\"preview?email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">预览</a></li>\r\n");
      out.write("    \t\t\t");
} else if(session.getAttribute("type").equals("noCom")){
      out.write("\r\n");
      out.write("    \t\t\t<li ><a href=\"company.jsp\" rel=\"nofollow\">完善公司信息</a></li>\r\n");
      out.write("    \t\t\t");
} } else{
      out.write("\r\n");
      out.write("    \t\t\t<li ><a href=\"login.jsp\" rel=\"nofollow\">企业版</a></li>\r\n");
      out.write("                <li ><a href=\"login.jsp\" rel=\"nofollow\">学生版</a></li>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\t    \t\t<li><a href=\"login.jsp\" rel=\"nofollow\">登录</a></li>\r\n");
      out.write("               \t<li><a href=\"register.jsp\" rel=\"nofollow\">注册</a></li>\r\n");
      out.write("\t    \t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- end #header -->\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t<div class=\"mainNavs\" id=\"kk\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"menu_box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>热门兼职 <span></span></h2>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                            <dl class=\"reset\">\r\n");
      out.write("                                <dt><a href=\"#\">热门兼职</a></dt>\r\n");
      out.write("                                <dd><a href=\"#\">服务员</a>\r\n");
      out.write("                                    <a href=\"#\">促销导购</a>\r\n");
      out.write("                                    <a href=\"#\">打包分拣</a>\r\n");
      out.write("                                    <a href=\"#\">礼仪模特</a>\r\n");
      out.write("                                    <a href=\"#\">话务客服</a>\r\n");
      out.write("                                    <a href=\"#\">家教助教</a>\r\n");
      out.write("                                    <a href=\"#\">充场</a>\r\n");
      out.write("                                    <a href=\"#\">问卷调查</a>\r\n");
      out.write("                                </dd>\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                      <div class=\"menu_box\">\r\n");
      out.write("                                        \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                                        \t\t\t\t\t\t\t<h2>演艺达人<span></span></h2>\r\n");
      out.write("                                        \t\t\t            </div>\r\n");
      out.write("                                        \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                                    <dl class=\"reset\">\r\n");
      out.write("                                                                        <dt><a href=\"#\">演艺达人</a></dt>\r\n");
      out.write("                                                                        <dd><a href=\"#\">礼仪模特</a>\r\n");
      out.write("                                                                            <a href=\"#\">群众演员</a>\r\n");
      out.write("                                                                            <a href=\"#\">演出</a>\r\n");
      out.write("                                                                        </dd>\r\n");
      out.write("                                                                    </dl>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                   <div class=\"menu_box\">\r\n");
      out.write("                   \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                   \t\t\t\t\t\t\t<h2>简单易做<span></span></h2>\r\n");
      out.write("                   \t\t\t            </div>\r\n");
      out.write("                   \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                               <dl class=\"reset\">\r\n");
      out.write("                                                   <dt><a href=\"#\">简单易做</a></dt>\r\n");
      out.write("                                                   <dd><a href=\"#\">传单派发</a>\r\n");
      out.write("                                                       <a href=\"#\">打包分拣</a>\r\n");
      out.write("                                                       <a href=\"#\">充场</a>\r\n");
      out.write("                                                       <a href=\"#\">问卷调查</a>\r\n");
      out.write("                                                       <a href=\"#\">审核录入</a>\r\n");
      out.write("                                                       <a href=\"#\">保洁</a>\r\n");
      out.write("                                                       <a href=\"#\">地推拉访</a>\r\n");
      out.write("                                                   </dd>\r\n");
      out.write("                                               </dl>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                   <div class=\"menu_box\">\r\n");
      out.write("                   \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                   \t\t\t\t\t\t\t<h2>跑腿办事<span></span></h2>\r\n");
      out.write("                   \t\t\t            </div>\r\n");
      out.write("                   \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                               <dl class=\"reset\">\r\n");
      out.write("                                                   <dt><a href=\"#\">跑腿办事</a></dt>\r\n");
      out.write("                                                   <dd><a href=\"#\">挂号排队</a>\r\n");
      out.write("                                                       <a href=\"#\">送餐员</a>\r\n");
      out.write("                                                       <a href=\"#\">宠物寄养</a>\r\n");
      out.write("                                                       <a href=\"#\">车票代购</a>\r\n");
      out.write("                                                   </dd>\r\n");
      out.write("                                               </dl>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                   <div class=\"menu_box\">\r\n");
      out.write("                   \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                   \t\t\t\t\t\t\t<h2>室内推荐<span></span></h2>\r\n");
      out.write("                   \t\t\t            </div>\r\n");
      out.write("                   \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                               <dl class=\"reset\">\r\n");
      out.write("                                                   <dt><a href=\"#\">室内推荐</a></dt>\r\n");
      out.write("                                                   <dd><a href=\"#\">话务客服</a>\r\n");
      out.write("                                                       <a href=\"#\">促销导购</a>\r\n");
      out.write("                                                       <a href=\"#\">文员</a>\r\n");
      out.write("                                                       <a href=\"#\">展会协助</a>\r\n");
      out.write("                                                   </dd>\r\n");
      out.write("                                               </dl>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                       </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                    \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                    \t\t\t\t\t\t\t<h2>体力达人<span></span></h2>\r\n");
      out.write("                    \t\t\t            </div>\r\n");
      out.write("                    \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                <dl class=\"reset\">\r\n");
      out.write("                                                    <dt><a href=\"#\">体力达人</a></dt>\r\n");
      out.write("                                                    <dd><a href=\"#\">餐饮工</a>\r\n");
      out.write("                                                        <a href=\"#\">服务员</a>\r\n");
      out.write("                                                        <a href=\"#\">安保</a>\r\n");
      out.write("                                                        <a href=\"#\">会展执行</a>\r\n");
      out.write("                                                        <a href=\"#\">快递配送</a>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                    \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                    \t\t\t\t\t\t\t<h2>专业技能<span></span></h2>\r\n");
      out.write("                    \t\t\t            </div>\r\n");
      out.write("                    \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                <dl class=\"reset\">\r\n");
      out.write("                                                    <dt><a href=\"#\">专业技能</a></dt>\r\n");
      out.write("                                                    <dd><a href=\"#\">司机代驾</a>\r\n");
      out.write("                                                        <a href=\"#\">技师技工</a>\r\n");
      out.write("                                                        <a href=\"#\">美容美发</a>\r\n");
      out.write("                                                        <a href=\"#\">月嫂阿姨</a>\r\n");
      out.write("                                                        <a href=\"#\">销售房产</a>\r\n");
      out.write("                                                        <a href=\"#\">经纪人</a>\r\n");
      out.write("                                                        <a href=\"#\">保险</a>\r\n");
      out.write("                                                        <a href=\"#\">在线老师</a>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                    \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                    \t\t\t\t\t\t\t<h2>特色职位<span></span></h2>\r\n");
      out.write("                    \t\t\t            </div>\r\n");
      out.write("                    \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                <dl class=\"reset\">\r\n");
      out.write("\r\n");
      out.write("                                                    <dt><a href=\"#\">特色职位</a></dt>\r\n");
      out.write("                                                    <dd><a href=\"#\">校园代理</a>\r\n");
      out.write("                                                        <a href=\"#\">家教助教</a>\r\n");
      out.write("                                                        <a href=\"#\">健身教练</a>\r\n");
      out.write("                                                        <a href=\"#\">翻译</a>\r\n");
      out.write("                                                        <a href=\"#\">婚礼主持</a>\r\n");
      out.write("                                                        <a href=\"#\">摄影摄像</a>\r\n");
      out.write("                                                        <a href=\"#\">旅行导游</a>\r\n");
      out.write("                                                        <a href=\"#\">美工设计</a>\r\n");
      out.write("                                                        <a href=\"#\">创意策划</a>\r\n");
      out.write("                                                        <a href=\"#\">财务会计</a>\r\n");
      out.write("                                                        <a href=\"#\">项目外包</a>\r\n");
      out.write("                                                        <a href=\"#\">软件开发</a>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                    \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                    \t\t\t\t\t\t\t<h2>优秀青年<span></span></h2>\r\n");
      out.write("                    \t\t\t            </div>\r\n");
      out.write("                    \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                <dl class=\"reset\">\r\n");
      out.write("                                                    <dt><a href=\"#\">优秀青年</a></dt>\r\n");
      out.write("                                                    <dd><a href=\"#\">志愿者</a>\r\n");
      out.write("                                                        <a href=\"#\">救生员</a>\r\n");
      out.write("                                                        <a href=\"#\">实习生</a>\r\n");
      out.write("                                                        <a href=\"#\">社会义工</a>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"menu_box\">\r\n");
      out.write("                    \t\t\t\t\t\t<div class=\"menu_main\">\r\n");
      out.write("                    \t\t\t\t\t\t\t<h2>其他<span></span></h2>\r\n");
      out.write("                    \t\t\t            </div>\r\n");
      out.write("                    \t\t\t\t\t   \t<div class=\"menu_sub dn\">\r\n");
      out.write("                                                <dl class=\"reset\">\r\n");
      out.write("                                                    <dt><a href=\"#\">其他</a></dt>\r\n");
      out.write("                                                    <dd><a href=\"#\">临时工</a>\r\n");
      out.write("                                                        <a href=\"#\">其他</a>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("        \t        \t\t\t<div id=\"search_box\">\r\n");
      out.write("\r\n");
      out.write("                    <ul id=\"searchType\">\r\n");
      out.write("                \t    <li class=\"type_selected\">职位</li>\r\n");
      out.write("                \t</ul>\r\n");
      out.write("                <div class=\"searchtype_arrow\"></div>\r\n");
      out.write("                <input type=\"text\" id=\"search_input\" name = \"kd\"  tabindex=\"1\" value=\"\"  placeholder=\"请输入兼职名称，如：话务客服\"  />\r\n");
      out.write("                <input type=\"submit\" id=\"search_button\" value=\"搜索\" />\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("<ul class=\"hot_pos reset\" id=\"allRe\"></ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}\r\n");
      out.write(".ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}\r\n");
      out.write(".ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}\r\n");
      out.write(".ui-menu-item a{display:block;overflow:hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- <div id=\"loginToolBar\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<em></em>\r\n");
      out.write("\t\t<img src=\"style/images/footbar_logo.png\" width=\"138\" height=\"45\" />\r\n");
      out.write("\t\t<span class=\"companycount\"></span>\r\n");
      out.write("\t\t<span class=\"positioncount\"></span>\r\n");
      out.write("\t\t<a href=\"#loginPop\" class=\"bar_login inline\" title=\"登录\"><i></i></a>\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<a href=\"register.html?from=index_footerbar\" onclick=\"_hmt.push(['_trackEvent', 'button', 'click', 'register'])\" class=\"bar_register\" id=\"bar_register\" target=\"_blank\"><i></i></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"cc\" value=\"16002\" />\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"cp\" value=\"96531\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write(" -->\r\n");
      out.write("<!-------------------------------------弹窗lightbox  ----------------------------------------->\r\n");
      out.write("<div style=\"display:none;\">\r\n");
      out.write("\t<!-- 登录框 -->\r\n");
      out.write("\t<div id=\"loginPop\" class=\"popup\" style=\"height:240px;\">\r\n");
      out.write("       \t<form id=\"loginForm\">\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"email\" name=\"email\" tabindex=\"1\" placeholder=\"请输入登录邮箱地址\" />\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"password\" name=\"password\" tabindex=\"2\" placeholder=\"请输入密码\" />\r\n");
      out.write("\t\t\t<span class=\"error\" style=\"display:none;\" id=\"beError\"></span>\r\n");
      out.write("\t\t    <label class=\"fl\" for=\"remember\"><input type=\"checkbox\" id=\"remember\" value=\"\" checked=\"checked\" name=\"autoLogin\" /> 记住我</label>\r\n");
      out.write("\t\t    <a href=\"h/reset.html\" class=\"fr\">忘记密码？</a>\r\n");
      out.write("\t\t    <input type=\"submit\" id=\"submitLogin\" value=\"登 &nbsp; &nbsp; 录\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div class=\"login_right\">\r\n");
      out.write("\t\t\t<div>还没有帐号？</div>\r\n");
      out.write("\t\t\t<a href=\"register.html\" class=\"registor_now\">立即注册</a>\r\n");
      out.write("\t\t    <div class=\"login_others\">使用以下帐号直接登录:</div>\r\n");
      out.write("\t\t    <a href=\"h/ologin/auth/sina.html\" target=\"_blank\" id=\"icon_wb\" class=\"icon_wb\" title=\"使用新浪微博帐号登录\"></a>\r\n");
      out.write("\t\t    <a href=\"h/ologin/auth/qq.html\" class=\"icon_qq\" id=\"icon_qq\" target=\"_blank\" title=\"使用腾讯QQ帐号登录\" ></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div><!--/#loginPop-->\r\n");
      out.write("</div>\r\n");
      out.write("<!------------------------------------- end ----------------------------------------->\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/Chart.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/home.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/count.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/core.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"style/js/popup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- <script src=\"style/js/wb.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
