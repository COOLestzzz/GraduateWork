/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-16 12:16:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("           \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>欢迎页面-X-admin2.0</title>\n");
      out.write("        <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("           <link rel=\"stylesheet\" href=\"style/css/font.css\">\n");
      out.write("           \t<link rel=\"stylesheet\" href=\"style/css/xadmin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"x-body\">\n");
      out.write("            <blockquote class=\"layui-elem-quote\">欢迎使用x-admin 后台模版！v2.0官方交流群： 519492808</blockquote>\n");
      out.write("            <fieldset class=\"layui-elem-field\">\n");
      out.write("              <legend>信息统计</legend>\n");
      out.write("              <div class=\"layui-field-box\">\n");
      out.write("                <table class=\"layui-table\" lay-even>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>统计</th>\n");
      out.write("                            <th>资讯库</th>\n");
      out.write("                            <th>图片库</th>\n");
      out.write("                            <th>产品库</th>\n");
      out.write("                            <th>用户</th>\n");
      out.write("                            <th>管理员</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>总数</td>\n");
      out.write("                            <td>92</td>\n");
      out.write("                            <td>9</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>8</td>\n");
      out.write("                            <td>20</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>今日</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>昨日</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>本周</td>\n");
      out.write("                            <td>2</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>本月</td>\n");
      out.write("                            <td>2</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <table class=\"layui-table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\" scope=\"col\">服务器信息</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th width=\"30%\">服务器计算机名</th>\n");
      out.write("                        <td><span id=\"lbServerName\">http://127.0.0.1/</span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器IP地址</td>\n");
      out.write("                        <td>192.168.1.1</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器域名</td>\n");
      out.write("                        <td>x.xuebingsi.com</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器端口 </td>\n");
      out.write("                        <td>80</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器IIS版本 </td>\n");
      out.write("                        <td>Microsoft-IIS/6.0</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>本文件所在文件夹 </td>\n");
      out.write("                        <td>D:\\WebSite\\HanXiPuTai.com\\XinYiCMS.Web\\</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器操作系统 </td>\n");
      out.write("                        <td>Microsoft Windows NT 5.2.3790 Service Pack 2</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>系统所在文件夹 </td>\n");
      out.write("                        <td>C:\\WINDOWS\\system32</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器脚本超时时间 </td>\n");
      out.write("                        <td>30000秒</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器的语言种类 </td>\n");
      out.write("                        <td>Chinese (People's Republic of China)</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>.NET Framework 版本 </td>\n");
      out.write("                        <td>2.050727.3655</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器当前时间 </td>\n");
      out.write("                        <td>2017-01-01 12:06:23</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器IE版本 </td>\n");
      out.write("                        <td>6.0000</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>服务器上次启动到现在已运行 </td>\n");
      out.write("                        <td>7210分钟</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>逻辑驱动器 </td>\n");
      out.write("                        <td>C:\\D:\\</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CPU 总数 </td>\n");
      out.write("                        <td>4</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CPU 类型 </td>\n");
      out.write("                        <td>x86 Family 6 Model 42 Stepping 1, GenuineIntel</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>虚拟内存 </td>\n");
      out.write("                        <td>52480M</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>当前程序占用内存 </td>\n");
      out.write("                        <td>3.29M</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Asp.net所占内存 </td>\n");
      out.write("                        <td>51.46M</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>当前Session数量 </td>\n");
      out.write("                        <td>8</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>当前SessionID </td>\n");
      out.write("                        <td>gznhpwmp34004345jz2q3l45</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>当前系统用户名 </td>\n");
      out.write("                        <td>NETWORK SERVICE</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("              </div>\n");
      out.write("            </fieldset>\n");
      out.write("            <blockquote class=\"layui-elem-quote layui-quote-nm\">感谢layui,百度Echarts,jquery,本后台系统由X前端框架提供前端技术支持。</blockquote>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("        var _hmt = _hmt || [];\n");
      out.write("        (function() {\n");
      out.write("          var hm = document.createElement(\"script\");\n");
      out.write("          hm.src = \"https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190\";\n");
      out.write("          var s = document.getElementsByTagName(\"script\")[0]; \n");
      out.write("          s.parentNode.insertBefore(hm, s);\n");
      out.write("        })();\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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