package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calender_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>FullCalendar by Creative Tim </title>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href='resources/Company/Events/assets/assets/css/fullcalendar.css' rel='stylesheet' />\n");
      out.write("<link href='resources/Company/Events/assets/assets/css/fullcalendar.print.css' rel='stylesheet' media='print' />\n");
      out.write("<script src='resources/Company/Events/assets/assets/js/jquery-1.10.2.js' type=\"text/javascript\"></script>\n");
      out.write("<script src='resources/Company/Events/assets/assets/js/jquery-ui.custom.min.js' type=\"text/javascript\"></script>\n");
      out.write("<script src='resources/Company/Events/assets/assets/js/fullcalendar.js' type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t    var date = new Date();\n");
      out.write("\t\tvar d = date.getDate();\n");
      out.write("\t\tvar m = date.getMonth();\n");
      out.write("\t\tvar y = date.getFullYear();\n");
      out.write("\n");
      out.write("\t\t/*  className colors\n");
      out.write("\n");
      out.write("\t\tclassName: default(transparent), important(red), chill(pink), success(green), info(blue)\n");
      out.write("\n");
      out.write("\t\t*/\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t/* initialize the external events\n");
      out.write("\t\t-----------------------------------------------------------------*/\n");
      out.write("\n");
      out.write("\t\t$('#external-events div.external-event').each(function() {\n");
      out.write("\n");
      out.write("\t\t\t// create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)\n");
      out.write("\t\t\t// it doesn't need to have a start or end\n");
      out.write("\t\t\tvar eventObject = {\n");
      out.write("\t\t\t\ttitle: $.trim($(this).text()) // use the element's text as the event title\n");
      out.write("\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t// store the Event Object in the DOM element so we can get to it later\n");
      out.write("\t\t\t$(this).data('eventObject', eventObject);\n");
      out.write("\n");
      out.write("\t\t\t// make the event draggable using jQuery UI\n");
      out.write("\t\t\t$(this).draggable({\n");
      out.write("\t\t\t\tzIndex: 999,\n");
      out.write("\t\t\t\trevert: true,      // will cause the event to go back to its\n");
      out.write("\t\t\t\trevertDuration: 0  //  original position after the drag\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t/* initialize the calendar\n");
      out.write("\t\t-----------------------------------------------------------------*/\n");
      out.write("\n");
      out.write("\t\tvar calendar =  $('#calendar').fullCalendar({\n");
      out.write("\t\t\theader: {\n");
      out.write("\t\t\t\tleft: 'title',\n");
      out.write("\t\t\t\tcenter: 'agendaDay,agendaWeek,month',\n");
      out.write("\t\t\t\tright: 'prev,next today'\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\teditable: true,\n");
      out.write("\t\t\tfirstDay: 1, //  1(Monday) this can be changed to 0(Sunday) for the USA system\n");
      out.write("\t\t\tselectable: true,\n");
      out.write("\t\t\tdefaultView: 'month',\n");
      out.write("\n");
      out.write("\t\t\taxisFormat: 'h:mm',\n");
      out.write("\t\t\tcolumnFormat: {\n");
      out.write("                month: 'ddd',    // Mon\n");
      out.write("                week: 'ddd d', // Mon 7\n");
      out.write("                day: 'dddd M/d',  // Monday 9/7\n");
      out.write("                agendaDay: 'dddd d'\n");
      out.write("            },\n");
      out.write("            titleFormat: {\n");
      out.write("                month: 'MMMM yyyy', // September 2009\n");
      out.write("                week: \"MMMM yyyy\", // September 2009\n");
      out.write("                day: 'MMMM yyyy'                  // Tuesday, Sep 8, 2009\n");
      out.write("            },\n");
      out.write("\t\t\tallDaySlot: false,\n");
      out.write("\t\t\tselectHelper: true,\n");
      out.write("\t\t\tselect: function(start, end, allDay) {\n");
      out.write("\t\t\t\tvar title = prompt('Event Title:');\n");
      out.write("\t\t\t\tif (title) {\n");
      out.write("\t\t\t\t\tcalendar.fullCalendar('renderEvent',\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\ttitle: title,\n");
      out.write("\t\t\t\t\t\t\tstart: start,\n");
      out.write("\t\t\t\t\t\t\tend: end,\n");
      out.write("\t\t\t\t\t\t\tallDay: allDay\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\ttrue // make the event \"stick\"\n");
      out.write("\t\t\t\t\t);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tcalendar.fullCalendar('unselect');\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tdroppable: true, // this allows things to be dropped onto the calendar !!!\n");
      out.write("\t\t\tdrop: function(date, allDay) { // this function is called when something is dropped\n");
      out.write("\n");
      out.write("\t\t\t\t// retrieve the dropped element's stored Event Object\n");
      out.write("\t\t\t\tvar originalEventObject = $(this).data('eventObject');\n");
      out.write("\n");
      out.write("\t\t\t\t// we need to copy it, so that multiple events don't have a reference to the same object\n");
      out.write("\t\t\t\tvar copiedEventObject = $.extend({}, originalEventObject);\n");
      out.write("\n");
      out.write("\t\t\t\t// assign it the date that was reported\n");
      out.write("\t\t\t\tcopiedEventObject.start = date;\n");
      out.write("\t\t\t\tcopiedEventObject.allDay = allDay;\n");
      out.write("\n");
      out.write("\t\t\t\t// render the event on the calendar\n");
      out.write("\t\t\t\t// the last `true` argument determines if the event \"sticks\" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)\n");
      out.write("\t\t\t\t$('#calendar').fullCalendar('renderEvent', copiedEventObject, true);\n");
      out.write("\n");
      out.write("\t\t\t\t// is the \"remove after drop\" checkbox checked?\n");
      out.write("\t\t\t\tif ($('#drop-remove').is(':checked')) {\n");
      out.write("\t\t\t\t\t// if so, remove the element from the \"Draggable Events\" list\n");
      out.write("\t\t\t\t\t$(this).remove();\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t},\n");
      out.write("\n");
      out.write("\t\t\tevents: [\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'All Day Event',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, 1)\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, d-3, 16, 0),\n");
      out.write("\t\t\t\t\tallDay: false,\n");
      out.write("\t\t\t\t\tclassName: 'info'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, d+4, 16, 0),\n");
      out.write("\t\t\t\t\tallDay: false,\n");
      out.write("\t\t\t\t\tclassName: 'info'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, d, 10, 30),\n");
      out.write("\t\t\t\t\tallDay: false,\n");
      out.write("\t\t\t\t\tclassName: 'important'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Lunch',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, d, 12, 0),\n");
      out.write("\t\t\t\t\tend: new Date(y, m, d, 14, 0),\n");
      out.write("\t\t\t\t\tallDay: false,\n");
      out.write("\t\t\t\t\tclassName: 'important'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Birthday Party',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, d+1, 19, 0),\n");
      out.write("\t\t\t\t\tend: new Date(y, m, d+1, 22, 30),\n");
      out.write("\t\t\t\t\tallDay: false,\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Click for Google',\n");
      out.write("\t\t\t\t\tstart: new Date(y, m, 28),\n");
      out.write("\t\t\t\t\tend: new Date(y, m, 29),\n");
      out.write("\t\t\t\t\turl: 'http://google.com/',\n");
      out.write("\t\t\t\t\tclassName: 'success'\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t],\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\tbody {\n");
      out.write("\t\tmargin-top: 40px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tfont-size: 14px;\n");
      out.write("\t\tfont-family: \"Helvetica Nueue\",Arial,Verdana,sans-serif;\n");
      out.write("\t\tbackground-color: #DDDDDD;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#wrap {\n");
      out.write("\t\twidth: 1100px;\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#external-events {\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t\twidth: 150px;\n");
      out.write("\t\tpadding: 0 10px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#external-events h4 {\n");
      out.write("\t\tfont-size: 16px;\n");
      out.write("\t\tmargin-top: 0;\n");
      out.write("\t\tpadding-top: 1em;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t.external-event { /* try to mimick the look of a real event */\n");
      out.write("\t\tmargin: 10px 0;\n");
      out.write("\t\tpadding: 2px 4px;\n");
      out.write("\t\tbackground: #3366CC;\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\tfont-size: .85em;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#external-events p {\n");
      out.write("\t\tmargin: 1.5em 0;\n");
      out.write("\t\tfont-size: 11px;\n");
      out.write("\t\tcolor: #666;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#external-events p input {\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tvertical-align: middle;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t#calendar {\n");
      out.write("/* \t\tfloat: right; */\n");
      out.write("        margin: 0 auto;\n");
      out.write("\t\twidth: 900px;\n");
      out.write("\t\tbackground-color: #FFFFFF;\n");
      out.write("\t\t  border-radius: 6px;\n");
      out.write("        box-shadow: 0 1px 2px #C3C3C3;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id='wrap'>\n");
      out.write("\n");
      out.write("<div id='calendar'></div>\n");
      out.write("\n");
      out.write("<div style='clear:both'></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
