package com.arnisand.mymanager.data.repository.file

interface FileRepository {

    fun getFoldersAFiles()
    fun getFolder()
    fun getFile()
}