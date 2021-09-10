package com.brown.todo.data

import com.brown.todo.data.local.TaskDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor(
    private val taskDao: TaskDao
) {

    fun getTaskListFlow() = taskDao.getTaskListFlow()

}