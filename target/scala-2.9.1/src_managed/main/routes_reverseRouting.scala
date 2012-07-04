// @SOURCE:/Users/saito_hirokazu/Documents/workspace/blooming-galaxy-3087/conf/routes
// @HASH:a2adebf4ed35b5af7c733c8cd8ef9002d784ee4b
// @DATE:Tue Jun 19 19:11:58 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def speak() = {
   Call("POST", "/speak")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def speak = JavascriptReverseRoute(
   "controllers.Application.speak",
   """
      function() {
      return _wA({method:"POST", url:"/speak"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def speak() = new play.api.mvc.HandlerRef(
   controllers.Application.speak(), HandlerDef(this, "controllers.Application", "speak", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:10
class ReverseAssets {
    


 
// @LINE:10
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                