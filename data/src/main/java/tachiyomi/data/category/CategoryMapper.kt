package tachiyomi.data.category

import tachiyomi.domain.category.model.Category

object CategoryMapper {
    fun mapCategory(
        id: Long,
        name: String,
        order: Long,
        flags: Long,
        // KMK -->
        hidden: Long,
        // KMK <--
        // 新增：对应 SELECT 中最后追加的 group_tag 列
        groupTag: String?,
    ): Category {
        return Category(
            id = id,
            name = name,
            order = order,
            flags = flags,
            // KMK -->
            hidden = hidden == 1L,
            // KMK <--
            // 新增：映射 groupTag
            groupTag = groupTag,
        )
    }
}
