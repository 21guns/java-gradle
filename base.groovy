buildscript {
 repositories {
    mavenLocal()
    maven {
      url 'http://creditcloud.com:8081/nexus/content/groups/public'
      credentials {
        username "jenkins"
        password "hudson"
      }
    }
 }
repositories {
  mavenLocal()
  maven {
    url 'http://creditcloud.com:8081/nexus/content/groups/public'
    credentials {
      username "jenkins"
      password "hudson"
    }
  }
}

}