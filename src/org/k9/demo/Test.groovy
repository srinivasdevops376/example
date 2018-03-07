package org.k9.demo 

class Test {
  def config
  def script

  Test(script, config) {
    this.config = config
    this.script = script
  }

  void anything() {
    this.script.stage('testing') {
       this.script.echo "stage" + this.config.name
    }
  }
}
