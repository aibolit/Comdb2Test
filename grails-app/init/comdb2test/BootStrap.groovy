package comdb2test

class BootStrap {

    def init = { servletContext ->
        def w = new Widget(type: "pqr")
        
        w.lastModified = new Date()

        println w
        println w.save()   
        def a = new User(name: "abc")
        a.widgets = [w]
        println a.save()

        a.name = "def"
        println a.save()


        def b = new User(name: 'ijk').save()


    }
    def destroy = {
    }
}
