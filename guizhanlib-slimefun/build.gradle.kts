dependencies {
    api(project(":guizhanlib-common", configuration = "shadow"))
    api(project(":guizhanlib-localization", configuration = "shadow"))
    api(project(":guizhanlib-minecraft", configuration = "shadow"))
    compileOnly("com.github.drakescraft_labs:slimefun-core:11.0-Drake-1.21.11-SNAPSHOT")
}
