
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[service.DemoUser,securesocial.core.RuntimeEnvironment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: service.DemoUser, env: securesocial.core.RuntimeEnvironment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import securesocial.core.AuthenticationMethod._
/*3.2*/import Http.Context.Implicit


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("SecureSocial - Sample Protected Page")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*7.20*/user/*7.24*/.main.avatarUrl),format.raw/*7.39*/("""" alt=""""),_display_(/*7.47*/user/*7.51*/.main.fullName),format.raw/*7.65*/("""" width="40px" height="40px"/> Welcome """),_display_(/*7.105*/user/*7.109*/.main.firstName),format.raw/*7.124*/("""</h2>
</div>

<div class="clearfix">
    <h2>User Details</h2>

    <ul>
        <li>User Id: """),_display_(/*14.23*/user/*14.27*/.main.userId),format.raw/*14.39*/("""</li>
        <li>Logged in from: """),_display_(/*15.30*/user/*15.34*/.main.providerId),format.raw/*15.50*/("""</li>
        <li>Fist name: """),_display_(/*16.25*/user/*16.29*/.main.firstName),format.raw/*16.44*/("""</li>
        <li>Last name: """),_display_(/*17.25*/user/*17.29*/.main.lastName),format.raw/*17.43*/("""</li>
        <li>Full name: """),_display_(/*18.25*/user/*18.29*/.main.fullName),format.raw/*18.43*/("""</li>
        <li>Email: """),_display_(/*19.21*/user/*19.25*/.main.email.map/*19.40*/ { email =>_display_(Seq[Any](format.raw/*19.51*/(""" """),_display_(/*19.53*/email),format.raw/*19.58*/(""" """)))}/*19.60*/.getOrElse("Not Available")),format.raw/*19.87*/("""</li>
        <li>Authentication method: """),_display_(/*20.37*/user/*20.41*/.main.authMethod),format.raw/*20.57*/("""</li>
    </ul>

    """),_display_(/*23.6*/user/*23.10*/.main.oAuth1Info.map/*23.30*/ { info =>_display_(Seq[Any](format.raw/*23.40*/("""
    """),format.raw/*24.5*/("""<h2>OAuth1 Info</h2>

    <ul>
        <li>Token: """),_display_(/*27.21*/info/*27.25*/.token),format.raw/*27.31*/("""</li>
        <li>Secret: """),_display_(/*28.22*/info/*28.26*/.secret),format.raw/*28.33*/("""</li>
    </ul>
    """)))}),format.raw/*30.6*/("""

    """),_display_(/*32.6*/user/*32.10*/.main.oAuth2Info.map/*32.30*/ { info =>_display_(Seq[Any](format.raw/*32.40*/("""
    """),format.raw/*33.5*/("""<h2>OAuth2 Info</h2>

    <ul>
        <li>Access Token: """),_display_(/*36.28*/info/*36.32*/.accessToken),format.raw/*36.44*/("""</li>
        """),_display_(/*37.10*/info/*37.14*/.tokenType.map/*37.28*/ { t =>_display_(Seq[Any](format.raw/*37.35*/(""" """),format.raw/*37.36*/("""<li>Token Type: """),_display_(/*37.53*/t),format.raw/*37.54*/("""</li> """)))}),format.raw/*37.61*/("""
        """),_display_(/*38.10*/info/*38.14*/.expiresIn.map/*38.28*/ { exp =>_display_(Seq[Any](format.raw/*38.37*/(""" """),format.raw/*38.38*/("""<li>Expires in: """),_display_(/*38.55*/exp),format.raw/*38.58*/(""" """),format.raw/*38.59*/("""seconds</li>""")))}),format.raw/*38.72*/("""
        """),_display_(/*39.10*/info/*39.14*/.refreshToken.map/*39.31*/ { rt =>_display_(Seq[Any](format.raw/*39.39*/(""" """),format.raw/*39.40*/("""<li>Refresh Token: """),_display_(/*39.60*/rt),format.raw/*39.62*/("""</li>""")))}),format.raw/*39.68*/("""
    """),format.raw/*40.5*/("""</ul>
    """)))}),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""<hr>
    """),_display_(/*43.6*/user/*43.10*/.main.passwordInfo.map/*43.32*/ { info =>_display_(Seq[Any](format.raw/*43.42*/("""
	"""),format.raw/*44.2*/("""<a class="btn" href=""""),_display_(/*44.24*/env/*44.27*/.routes.passwordChangeUrl(Implicit.ctx()._requestHeader())),format.raw/*44.85*/("""">Change Password</a>
    """)))}),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""<hr>
    <a class="btn" href=""""),_display_(/*48.27*/securesocial/*48.39*/.controllers.routes.LoginPage.logout()),format.raw/*48.77*/("""">Logout</a>
</div>
""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(user:service.DemoUser,env:securesocial.core.RuntimeEnvironment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((service.DemoUser,securesocial.core.RuntimeEnvironment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 21 21:34:03 EDT 2018
                  SOURCE: D:/Development/SecureSocial-WithPlay2.6/app/views/index.scala.html
                  HASH: e1daff39fe2a8d89ccc9896c983141dfc04d9786
                  MATRIX: 995->1|1135->71|1190->121|1248->68|1276->151|1304->154|1356->198|1395->200|1423->202|1495->248|1507->252|1542->267|1576->275|1588->279|1622->293|1689->333|1702->337|1738->352|1867->454|1880->458|1913->470|1976->506|1989->510|2026->526|2084->557|2097->561|2133->576|2191->607|2204->611|2239->625|2297->656|2310->660|2345->674|2399->701|2412->705|2436->720|2485->731|2514->733|2540->738|2561->740|2609->767|2679->810|2692->814|2729->830|2780->855|2793->859|2822->879|2870->889|2903->895|2984->949|2997->953|3024->959|3079->987|3092->991|3120->998|3173->1021|3208->1030|3221->1034|3250->1054|3298->1064|3331->1070|3419->1131|3432->1135|3465->1147|3508->1163|3521->1167|3544->1181|3589->1188|3618->1189|3662->1206|3684->1207|3722->1214|3760->1225|3773->1229|3796->1243|3843->1252|3872->1253|3916->1270|3940->1273|3969->1274|4013->1287|4051->1298|4064->1302|4090->1319|4136->1327|4165->1328|4212->1348|4235->1350|4272->1356|4305->1362|4347->1374|4380->1380|4417->1391|4430->1395|4461->1417|4509->1427|4539->1430|4588->1452|4600->1455|4679->1513|4737->1541|4772->1549|4831->1581|4852->1593|4911->1631|4964->1654
                  LINES: 28->1|31->2|32->3|35->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|55->23|55->23|56->24|59->27|59->27|59->27|60->28|60->28|60->28|62->30|64->32|64->32|64->32|64->32|65->33|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|73->41|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|79->47|80->48|80->48|80->48|82->50
                  -- GENERATED --
              */
          