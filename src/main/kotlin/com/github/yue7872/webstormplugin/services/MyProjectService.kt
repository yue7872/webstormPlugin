package com.github.yue7872.webstormplugin.services

import com.intellij.openapi.project.Project
import com.github.yue7872.webstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
