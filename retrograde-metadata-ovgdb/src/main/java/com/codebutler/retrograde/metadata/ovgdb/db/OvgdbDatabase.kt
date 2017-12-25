/*
 * OvgdbDatabase.kt
 *
 * Copyright (C) 2017 Retrograde Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.retrograde.metadata.ovgdb.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.codebutler.retrograde.lib.ovgdb.db.dao.RegionDao
import com.codebutler.retrograde.lib.ovgdb.db.dao.ReleaseDao
import com.codebutler.retrograde.lib.ovgdb.db.dao.RomDao
import com.codebutler.retrograde.lib.ovgdb.db.dao.SystemDao
import com.codebutler.retrograde.lib.ovgdb.db.entity.Region
import com.codebutler.retrograde.lib.ovgdb.db.entity.Release
import com.codebutler.retrograde.lib.ovgdb.db.entity.Rom
import com.codebutler.retrograde.lib.ovgdb.db.entity.System

@Database(
        entities = [
            Region::class,
            Release::class,
            Rom::class,
            System::class],
        version = 1,
        exportSchema = false)
abstract class OvgdbDatabase : RoomDatabase() {

    abstract fun regionDao(): RegionDao

    abstract fun releaseDao(): ReleaseDao

    abstract fun romDao(): RomDao

    abstract fun systemDao(): SystemDao
}
