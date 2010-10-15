environments {
    development {
        modules = {
            'jquery' { 
                //        resource url:'js/jquery/jquery-1.4.2.min.js', nominify:true, disposition:'head', bundle:'jq'
                resource url:'js/jquery/jquery-1.4.2.min.js', disposition:'head', 
                    linkOverride: 'http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js'
            }
            'jquery-ui' {
                dependsOn 'jquery'
                resource url:[dir:'js/jquery-ui', file:'jquery-ui-1.8.2.custom.min.js?someargument=value'], nominify:true, bundle:'jq'
                resource url:[dir:'js/jquery-ui', file:'jquery-ui-1.8.2.custom.css'], nominify:true, 
                    attrs:[media:'screen, projection'], bundle:'jq'
            }
        }
    }
}