package com.borshevskiy.di

import com.borshevskiy.repository.HeroRepository
import com.borshevskiy.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}