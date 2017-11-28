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
        println b

        def c = new User(name: 'mno')
        c.save(flush: true)


        println "> test deletion"
        println "> byId:${User.get(c.id)}, byName:${User.findByName('mno')}"
        println "> delete ${User.findByName('mno').delete(flush:true)}"
        println "> find again ${User.get(c.id)}"

    }
    def destroy = {
    }
}
