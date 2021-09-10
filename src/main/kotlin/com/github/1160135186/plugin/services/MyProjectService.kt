package com.github.1160135186.plugin.services

import com.intellij.openapi.project.Project
import com.github.1160135186.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
