
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


        """),format.raw/*14.9*/("""<img onload="changeBackground("""),_display_(/*14.40*/m/*14.41*/.getBackgroundColour),format.raw/*14.61*/(""")" src="/assets/"""),_display_(/*14.78*/m/*14.79*/.getMoviePoster),format.raw/*14.94*/("""">
        /assets/"""),_display_(/*15.18*/m/*15.19*/.getMoviePoster),format.raw/*15.34*/("""
        """),_display_(/*16.10*/for(colour <- m.generateColours(10)) yield /*16.46*/{_display_(Seq[Any](format.raw/*16.47*/("""
           
            """),format.raw/*18.13*/("""<div style="background-color:"""),_display_(/*18.43*/colour),format.raw/*18.49*/("""; width:15em;">
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
                  DATE: Tue Jul 30 11:51:15 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: d30b7f7c345f0a274bccecdfe8a21a952e2a6e43
                  MATRIX: 970->1|1098->36|1138->50|1152->56|1217->101|1279->138|1300->151|1339->153|1370->158|1427->190|1458->206|1496->207|1544->228|1554->229|1595->249|1633->260|1691->291|1701->292|1742->312|1786->329|1796->330|1832->345|1879->365|1889->366|1925->381|1962->391|2014->427|2053->428|2106->453|2163->483|2190->489|2263->535|2278->541|2349->591|2380->595|2407->601|2472->635|2508->641|2542->645
                  LINES: 28->1|33->2|33->2|33->2|33->2|35->4|35->4|35->4|36->5|38->7|38->7|38->7|42->11|42->11|42->11|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|53->22|54->23|57->26
                  -- GENERATED --
              */
          