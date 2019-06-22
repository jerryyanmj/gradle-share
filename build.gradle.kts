val springVersion by extra("3.1.0.RELEASE")
val emailNotification by extra { "build@master.org" }
apply(from = "common-display-info.gradle.kts")
apply(from = "common-jar-versions.gradle.kts")


tasks.register("printProperties") {

    doLast {
        println(springVersion)
        println(emailNotification)
        println(commonLang)
    }
}
