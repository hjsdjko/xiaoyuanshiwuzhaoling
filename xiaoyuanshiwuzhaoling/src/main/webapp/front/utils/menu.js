









const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"失物招领信息",
                        "menuJump":"列表",
                        "tableName":"xiaoyuanshiwuzhaoling"
                    }
                ],
                "menu":"失物招领信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"失物招领留言信息",
                        "menuJump":"列表",
                        "tableName":"xiaoyuanshiwuzhaolingLiuyan"
                    }
                ],
                "menu":"失物招领留言信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"寻物启事信息",
                        "menuJump":"列表",
                        "tableName":"xunwuqishi"
                    }
                ],
                "menu":"寻物启事信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"寻物启事留言信息",
                        "menuJump":"列表",
                        "tableName":"xunwuqishiLiuyan"
                    }
                ],
                "menu":"寻物启事留言信息"
            },
			{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"失物认领信息",
			            "menuJump":"列表",
			            "tableName":"shiwurenling"
			        }
			    ],
			    "menu":"失物认领信息"
			}
			,
			{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"公告信息",
			            "menuJump":"列表",
			            "tableName":"news"
			        }
			    ],
			    "menu":"公告信息"
			}
			,
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"用户",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;
