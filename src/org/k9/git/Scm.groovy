package org.k9.git
import org.k9.*

class Git implements Serializable {
  def config
  def script

  Git(script,config) {
    this.config = config
    this.script = script
  }
  
  void checkout(){    
    this.script.stage('checkout'){
        this.script.git(url: this.config.scm_url, branch: this.config.scm_branch)
    }
  
    }
  }
