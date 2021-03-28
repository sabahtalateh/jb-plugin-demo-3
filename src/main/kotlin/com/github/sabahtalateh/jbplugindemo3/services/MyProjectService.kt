package com.github.sabahtalateh.jbplugindemo3.services

import com.github.sabahtalateh.jbplugindemo3.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
