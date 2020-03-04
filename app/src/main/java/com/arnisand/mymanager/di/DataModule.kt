package com.arnisand.mymanager.di

import com.arnisand.mymanager.data.repository.file.FileRepository
import com.arnisand.mymanager.data.repository.file.FileRepositoryImpl
import com.arnisand.mymanager.domain.usecase.FileUseCase
import com.arnisand.mymanager.domain.usecase.FileUseCaseImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<FileRepository> { FileRepositoryImpl() }
}

val useCaseModule = module {
    single<FileUseCase> { FileUseCaseImpl(get()) }
}