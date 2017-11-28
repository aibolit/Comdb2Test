package comdb2test

import groovy.transform.ToString 

@ToString(includeNames=true)
class Widget {

    String type
    Date lastModified

    static constraints = {
    }


}
