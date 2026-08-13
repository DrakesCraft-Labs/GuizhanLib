dependencies {
    api(project(":guizhanlib-common", configuration = "shadow"))
    api(project(":guizhanlib-libraries", configuration = "shadow"))
    api(project(":guizhanlib-localization", configuration = "shadow"))
    api(project(":guizhanlib-minecraft", configuration = "shadow"))
    api(project(":guizhanlib-slimefun", configuration = "shadow"))
    // The Chinese Slimefun storage adapter targets a different core and is intentionally omitted.
    // Runtime updaters are also omitted: DrakesCraft deploys reviewed artifacts centrally.
}
