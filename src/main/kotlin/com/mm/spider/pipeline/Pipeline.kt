package com.mm.spider.pipeline

import com.mm.spider.ResultItems

abstract class Pipeline {
    abstract fun process(resultItems: ResultItems)
    fun process(resultItems: ResultItems, processor: (resultItems: ResultItems) -> Unit) {
        processor(resultItems)
    }
}