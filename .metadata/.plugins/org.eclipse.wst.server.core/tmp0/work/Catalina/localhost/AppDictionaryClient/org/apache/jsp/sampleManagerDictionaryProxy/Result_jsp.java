/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-13 07:44:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleManagerDictionaryProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1 style=\"color:purple;\">Result</H1>\r\n");
      out.write("\r\n");
      dictionary.ManagerDictionaryProxy sampleManagerDictionaryProxyid = null;
      synchronized (session) {
        sampleManagerDictionaryProxyid = (dictionary.ManagerDictionaryProxy) _jspx_page_context.getAttribute("sampleManagerDictionaryProxyid", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sampleManagerDictionaryProxyid == null){
          sampleManagerDictionaryProxyid = new dictionary.ManagerDictionaryProxy();
          _jspx_page_context.setAttribute("sampleManagerDictionaryProxyid", sampleManagerDictionaryProxyid, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleManagerDictionaryProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleManagerDictionaryProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleManagerDictionaryProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        dictionary.ManagerDictionary getManagerDictionary10mtemp = sampleManagerDictionaryProxyid.getManagerDictionary();
if(getManagerDictionary10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getManagerDictionary10mtemp );
      out.write('\r');
      out.write('\n');

}else{
        if(getManagerDictionary10mtemp!= null){
        String tempreturnp11 = getManagerDictionary10mtemp.toString();
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp11);
      out.write("\r\n");
      out.write("        ");

        }}
break;
case 13:
        gotMethod = true;
        String word_1id=  request.getParameter("word16");
            java.lang.String word_1idTemp = null;
        if(!word_1id.equals("")){
         word_1idTemp  = word_1id;
        }
        String mean_2id=  request.getParameter("mean18");
            java.lang.String mean_2idTemp = null;
        if(!mean_2id.equals("")){
         mean_2idTemp  = mean_2id;
        }
        String type_3id=  request.getParameter("type20");
            java.lang.String type_3idTemp = null;
        if(!type_3id.equals("")){
         type_3idTemp  = type_3id;
        }
        boolean update13mtemp = sampleManagerDictionaryProxyid.update(word_1idTemp,mean_2idTemp,type_3idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(update13mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp14 );
      out.write("\r\n");
      out.write("        ");

break;
case 22:
        gotMethod = true;
        String word_4id=  request.getParameter("word25");
            java.lang.String word_4idTemp = null;
        if(!word_4id.equals("")){
         word_4idTemp  = word_4id;
        }
        java.lang.String searchDictionary22mtemp = sampleManagerDictionaryProxyid.searchDictionary(word_4idTemp);
if(searchDictionary22mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(searchDictionary22mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(searchDictionary22mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp23 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 27:
        gotMethod = true;
        String word_5id=  request.getParameter("word30");
            java.lang.String word_5idTemp = null;
        if(!word_5id.equals("")){
         word_5idTemp  = word_5id;
        }
        boolean delDictionary27mtemp = sampleManagerDictionaryProxyid.delDictionary(word_5idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(delDictionary27mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp28 );
      out.write("\r\n");
      out.write("        ");

break;
case 32:
        gotMethod = true;
        String id_6id=  request.getParameter("id35");
        int id_6idTemp  = Integer.parseInt(id_6id);
        String word_7id=  request.getParameter("word37");
            java.lang.String word_7idTemp = null;
        if(!word_7id.equals("")){
         word_7idTemp  = word_7id;
        }
        String mean_8id=  request.getParameter("mean39");
            java.lang.String mean_8idTemp = null;
        if(!mean_8id.equals("")){
         mean_8idTemp  = mean_8id;
        }
        String type_9id=  request.getParameter("type41");
            java.lang.String type_9idTemp = null;
        if(!type_9id.equals("")){
         type_9idTemp  = type_9id;
        }
        boolean addDictionary32mtemp = sampleManagerDictionaryProxyid.addDictionary(id_6idTemp,word_7idTemp,mean_8idTemp,type_9idTemp);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addDictionary32mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp33 );
      out.write("\r\n");
      out.write("        ");

break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
