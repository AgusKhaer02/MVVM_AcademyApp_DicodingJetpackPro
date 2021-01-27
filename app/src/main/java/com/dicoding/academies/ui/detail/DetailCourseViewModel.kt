package com.dicoding.academies.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.ModuleEntity
import com.dicoding.academies.utils.DataDummy

class DetailCourseViewModel : ViewModel(){
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse() : CourseEntity{
        lateinit var course : CourseEntity

        val coursesEntites = DataDummy.generateDummyCourses()

        for (coursesEntity in coursesEntites){
            if(coursesEntity.courseId == courseId){
                course = coursesEntity
            }
        }

        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}