
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

object moviePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.movie.Movie,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movie: models.movie.Movie):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/moviePage.js")),format.raw/*2.66*/("""" type="text/javascript"></script>

"""),_display_(/*4.2*/main("Movie")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<h1>Welcome to Play!</h1>


        """),_display_(/*8.10*/movie/*8.15*/.getBackgroundColour),format.raw/*8.35*/("""


        """),format.raw/*11.9*/("""<img onload="changeBackground('"""),_display_(/*11.41*/movie/*11.46*/.getBackgroundColour),format.raw/*11.66*/("""')" src="/assets/"""),_display_(/*11.84*/movie/*11.89*/.getMoviePoster),format.raw/*11.104*/("""">
        
        """),_display_(/*13.10*/for(colour <- movie.generateColours(10)) yield /*13.50*/{_display_(Seq[Any](format.raw/*13.51*/("""
           
            """),format.raw/*15.13*/("""<div id="div" onClick="changeBackground()"  style="background-color:"""),_display_(/*15.82*/colour),format.raw/*15.88*/("""; width:15em;">
                    <a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.changeMovieColour(movie.getId, colour)),format.raw/*16.91*/(""""> """),_display_(/*16.95*/colour),format.raw/*16.101*/("""</a>
            </div>

        """)))}),format.raw/*19.10*/("""
""")))}),format.raw/*20.2*/("""
  """))
      }
    }
  }

  def render(movie:models.movie.Movie): play.twirl.api.HtmlFormat.Appendable = apply(movie)

  def f:((models.movie.Movie) => play.twirl.api.HtmlFormat.Appendable) = (movie) => apply(movie)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 30 14:44:36 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: 6cc2d40dfb9cf82245aac22c493ec954272cf341
                  MATRIX: 964->1|1085->29|1125->43|1139->49|1204->94|1266->131|1287->144|1326->146|1357->151|1420->188|1433->193|1473->213|1511->224|1570->256|1584->261|1625->281|1670->299|1684->304|1721->319|1769->340|1825->380|1864->381|1917->406|2013->475|2040->481|2113->527|2128->533|2203->587|2234->591|2262->597|2327->631|2359->633
                  LINES: 28->1|33->2|33->2|33->2|33->2|35->4|35->4|35->4|36->5|39->8|39->8|39->8|42->11|42->11|42->11|42->11|42->11|42->11|42->11|44->13|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|50->19|51->20
                  -- GENERATED --
              */
          