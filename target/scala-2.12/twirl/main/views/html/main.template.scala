
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*8.105*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <span class="brand" >SecureSocial 2 Java Sample</span>
                </div>
            </div>
        </div>

        <div class="container" style="padding-top:30px">
            """),_display_(/*22.14*/content),format.raw/*22.21*/("""
        """),format.raw/*23.9*/("""</div>                                         `
    </body>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 21 21:27:49 EDT 2018
                  SOURCE: D:/Development/SecureSocial-WithPlay2.6/app/views/main.scala.html
                  HASH: ae95b512f35c24ff32d3f26acc7c9a6dd544c22c
                  MATRIX: 952->1|1077->31|1107->35|1188->90|1213->95|1302->158|1316->164|1382->209|1470->271|1484->277|1536->309|1589->335|1604->341|1670->386|2095->784|2123->791|2160->801
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|54->22|54->22|55->23
                  -- GENERATED --
              */
          