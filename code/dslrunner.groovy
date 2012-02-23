class DSLRunner {

    void loadDSL(Closure cl) {
      println "loading DSL ..."
	  cl.delegate = this
	  cl()
    }

    void usage() {
        println "usage: DSLRunner <scriptFile>\n"
        System.exit(1)
    }

    static void main(String [] args) {
      DSLRunner runner = new DSLRunner()
      if(args.length < 1) { runner.usage() }

      def script = new File(args[0]).text
      def dsl = """run {  ${script} }"""

      def binding = new Binding()
      binding.run = { Closure cl -> runner.loadDSL(cl) }
      GroovyShell shell = new GroovyShell(binding)
      shell.evaluate(dsl)
   }
}