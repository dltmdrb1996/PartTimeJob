package com.bottotop.local

import com.bottotop.local.dao.CompanyDao
import com.bottotop.local.dao.UserDao
import com.bottotop.local.entity.LocalCompanyEntity
import com.bottotop.local.entity.LocalUserEntity
import javax.inject.Inject

internal class LocalDataSourceImpl @Inject constructor(
    private val userDao: UserDao,
    private val companyDao: CompanyDao
) : LocalDataSource {

    override suspend fun insertUser(user: LocalUserEntity) {
        userDao.insert(user)
    }

    override suspend fun getUser(id : String): LocalUserEntity = userDao.getUser(id)

    override suspend fun getMember(): List<LocalUserEntity> = userDao.getMember()

    override suspend fun insertCompany(company : LocalCompanyEntity) {
        companyDao.insert(company)
    }

    override suspend fun getCompany(id: String): LocalCompanyEntity = companyDao.getCompany(id)

    override suspend fun getCompanies(): List<LocalCompanyEntity> = companyDao.getCompanies()


}