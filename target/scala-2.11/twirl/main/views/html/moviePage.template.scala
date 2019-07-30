
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

object moviePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.movie.Movie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movies: List[models.movie.Movie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/moviePage.js")),format.raw/*2.66*/("""" type="text/javascript"></script>

"""),_display_(/*4.2*/main("Movie")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<h1>Welcome to Play!</h1>

    """),_display_(/*7.6*/for(m <- movies) yield /*7.22*/{_display_(Seq[Any](format.raw/*7.23*/("""

        
        
        """),_display_(/*11.10*/m/*11.11*/.getBackgroundColour),format.raw/*11.31*/("""


        """),format.raw/*14.9*/("""<img onload="changeBackground('"""),_display_(/*14.41*/m/*14.42*/.getBackgroundColour),format.raw/*14.62*/("""')" src="/assets/"""),_display_(/*14.80*/m/*14.81*/.getMoviePoster),format.raw/*14.96*/("""">
        /assets/"""),_display_(/*15.18*/m/*15.19*/.getMoviePoster),format.raw/*15.34*/("""
        """),_display_(/*16.10*/for(colour <- m.generateColours(10)) yield /*16.46*/{_display_(Seq[Any](format.raw/*16.47*/("""
           
            """),format.raw/*18.13*/("""<div id="div" onClick="changeBackground()"  style="background-color:"""),_display_(/*18.82*/colour),format.raw/*18.88*/("""; width:15em;">
                    <a href=""""),_display_(/*19.31*/routes/*19.37*/.HomeController.changeMovieColour(m.getId, colour)),format.raw/*19.87*/(""""> """),_display_(/*19.91*/colour),format.raw/*19.97*/("""</a>
            </div>

        """)))}),format.raw/*22.10*/("""
    """)))}),format.raw/*23.6*/("""


""")))}),format.raw/*26.2*/("""
  """))
      }
    }
  }

  def render(movies:List[models.movie.Movie]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[models.movie.Movie]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 30 13:23:59 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: 9cb30097da113b0c3380389d7a974d239cf93284
                  MATRIX: 970->1|1098->36|1138->50|1152->56|1217->101|1279->138|1300->151|1339->153|1370->158|1427->190|1458->206|1496->207|1552->236|1562->237|1603->257|1641->268|1700->300|1710->301|1751->321|1796->339|1806->340|1842->355|1889->375|1899->376|1935->391|1972->401|2024->437|2063->438|2116->463|2212->532|2239->538|2312->584|2327->590|2398->640|2429->644|2456->650|2521->684|2557->690|2591->694
                  LINES: 28->1|33->2|33->2|33->2|33->2|35->4|35->4|35->4|36->5|38->7|38->7|38->7|42->11|42->11|42->11|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|53->22|54->23|57->26
                  -- GENERATED --
              */
          