// tag::project-name[]
// top-level reference -- to the -- `Project` object's `name` property
println(name)

//  `project` property / -- available to -- ANY build script
println(project.name)
// end::project-name[]

tasks.register("check") {
    doLast {
    }
}
