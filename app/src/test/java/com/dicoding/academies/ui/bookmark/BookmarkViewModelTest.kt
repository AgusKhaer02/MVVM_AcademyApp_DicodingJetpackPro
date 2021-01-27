package com.dicoding.academies.ui.bookmark

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class BookmarkViewModelTest{

    private lateinit var viewModel : BookmarkViewModel

    @Before
    fun setUp(){
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val bookmarkEntities = viewModel.getBookmarks()
        assertNotNull(bookmarkEntities)
        assertEquals(5,bookmarkEntities.size)
    }
}