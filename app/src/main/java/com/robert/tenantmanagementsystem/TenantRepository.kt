package com.robert.tenantmanagementsystem

object TenantRepository {

    // The shared list of every tenant saved in the app
    val tenants = mutableListOf<Tenant>()

    // Add one tenant to the shared list
    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Add up every tenant's rent (used by the Dashboard)
    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}