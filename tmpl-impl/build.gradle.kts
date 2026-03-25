dependencies {
    compileOnly(libs.annos.jetbrains)

    implementation(libs.leycm.init)
    implementation(project(":api"))
}

tasks.named("sourcesJar") {
    mustRunAfter(":api:jar")
}
