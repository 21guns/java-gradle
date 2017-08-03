allprojects {
  ext.RepoConfigurator = {
  	mavenLocal()
    maven {
      url 'http://creditcloud.com:8081/nexus/content/groups/public'
      credentials {
        username "jenkins"
        password "hudson"
      }
  	}
  }
  buildscript.repositories RepoConfigurator
  repositories RepoConfigurator
}