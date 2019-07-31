
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
<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/moviePage.css")),format.raw/*3.98*/("""">


"""),_display_(/*6.2*/main("Movie")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""


    """),format.raw/*9.5*/("""<div id="main"> 

    <img id="bannerImage" class="mask1" src='/assets/images/movies/movieBanners/"""),_display_(/*11.82*/movie/*11.87*/.getId),format.raw/*11.93*/("""-Banner.jpg'>
    <h1 id="movieTitle">"""),_display_(/*12.26*/movie/*12.31*/.getTitle),format.raw/*12.40*/("""</h1>

        <img id="moviePoster" onload="changeBackground('"""),_display_(/*14.58*/movie/*14.63*/.getBackgroundColour),format.raw/*14.83*/("""')" src="/assets/"""),_display_(/*14.101*/movie/*14.106*/.getMoviePoster),format.raw/*14.121*/("""">
        
        <br>
        <br>

        <div id="colour-select-container">
            """),_display_(/*20.14*/for(colour <- movie.generateColours(10)) yield /*20.54*/{_display_(Seq[Any](format.raw/*20.55*/("""
            
            """),format.raw/*22.13*/("""<a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.changeMovieColour(movie.getId, colour)),format.raw/*22.83*/("""">
                <div id="colour-select" onClick="changeBackground()"  style="background-color:"""),_display_(/*23.96*/colour),format.raw/*23.102*/(""";">
                </div>
            </a>

            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div> <!--Div for color select container-->    
    
    <br>

    </div> <!---  Main Div  ---->
""")))}),format.raw/*33.2*/("""
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
                  DATE: Wed Jul 31 15:12:19 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: fde0b039407374b69f352d6f92f35dd10f9d5f3a
                  MATRIX: 964->1|1085->29|1125->43|1139->49|1204->94|1310->174|1324->180|1390->226|1421->232|1442->245|1481->247|1514->254|1640->353|1654->358|1681->364|1747->403|1761->408|1791->417|1882->481|1896->486|1937->506|1983->524|1998->529|2035->544|2157->639|2213->679|2252->680|2306->706|2343->716|2358->722|2433->776|2558->874|2586->880|2675->938|2711->947|2840->1046
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|37->6|37->6|37->6|40->9|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|45->14|45->14|45->14|51->20|51->20|51->20|53->22|53->22|53->22|53->22|54->23|54->23|58->27|59->28|64->33
                  -- GENERATED --
              */
          