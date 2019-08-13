
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
        <hr>
        <h3>Release Date: """),_display_(/*18.28*/movie/*18.33*/.getReleaseDate),format.raw/*18.48*/("""</h3>

        <h2>"""),_display_(/*20.14*/movie/*20.19*/.getMovieRating.getTotal),format.raw/*20.43*/("""</h2>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <div id="fillerContainer">



        """),_display_(/*50.10*/for(i <- 0 until 10) yield /*50.30*/{_display_(Seq[Any](format.raw/*50.31*/("""
                """),format.raw/*51.17*/("""<a href=""""),_display_(/*51.27*/routes/*51.33*/.HomeController.rateMovie(i, movie.getId)),format.raw/*51.74*/("""">
                        <div onmouseover="fillBlocks(this)" onmouseout="emptyBlocks()" onclick="rate(this)" id=""""),_display_(/*52.114*/i),format.raw/*52.115*/("""" class="box">
                                        <img class="starImage" src="PNGIX.com_star-outline-png_1183450.png">
                        </div>
                </a>    
        """)))}),format.raw/*56.10*/("""
        
        """),format.raw/*58.9*/("""</div>


        <div id="colour-select-container">
            """),_display_(/*62.14*/for(colour <- movie.generateColours(10)) yield /*62.54*/{_display_(Seq[Any](format.raw/*62.55*/("""
            
            """),format.raw/*64.13*/("""<a href=""""),_display_(/*64.23*/routes/*64.29*/.HomeController.changeMovieColour(movie.getId, colour)),format.raw/*64.83*/("""">
                <div id="colour-select" onClick="changeBackground()"  style="background-color:"""),_display_(/*65.96*/colour),format.raw/*65.102*/(""";">
                </div>
            </a>

            """)))}),format.raw/*69.14*/("""
        """),format.raw/*70.9*/("""</div> <!--Div for color select container-->    
    
    <br>

    </div> <!---  Main Div  ---->
""")))}),format.raw/*75.2*/("""
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
                  DATE: Tue Aug 13 11:46:03 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: 6b40cd71e27be4a1439eb6815064b3144becbb66
                  MATRIX: 964->1|1085->29|1125->43|1139->49|1204->94|1310->174|1324->180|1390->226|1421->232|1442->245|1481->247|1514->254|1640->353|1654->358|1681->364|1747->403|1761->408|1791->417|1882->481|1896->486|1937->506|1983->524|1998->529|2035->544|2127->609|2141->614|2177->629|2224->649|2238->654|2283->678|2676->1044|2712->1064|2751->1065|2796->1082|2833->1092|2848->1098|2910->1139|3054->1255|3077->1256|3297->1445|3342->1463|3434->1528|3490->1568|3529->1569|3583->1595|3620->1605|3635->1611|3710->1665|3835->1763|3863->1769|3952->1827|3988->1836|4117->1935
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|37->6|37->6|37->6|40->9|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|45->14|45->14|45->14|49->18|49->18|49->18|51->20|51->20|51->20|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|87->56|89->58|93->62|93->62|93->62|95->64|95->64|95->64|95->64|96->65|96->65|100->69|101->70|106->75
                  -- GENERATED --
              */
          