<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
    <meta content="text/html;charset=UTF-8">
    <title>e3商城后台管理系统</title>
    <%--css--%>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>plugin/easyui/themes/gray/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>plugin/easyui/themes/icon.css">
    <%--js--%>
    <script src="<%=basePath%>plugin/easyui/jquery.min.js"></script>
    <script src="<%=basePath%>plugin/easyui/jquery.easyui.min.js"></script>
    <script src="<%=basePath%>plugin/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="application/javascript">
        $(function () {
            //动态树形菜单数据
            var treeData = [{
                text: "商品管理",
                children: [{
                    text: "新增商品",
                    attributes: {
                        url: 'item-add'
                    }
                },{
                    text: "查询商品",
                    attributes: {
                        url: 'item-list'
                    }
                }
                ]
            }];
            $('#menu').tree({
                data : treeData,
                onClick: function(node){
                    if($('#menu').tree("isLeaf",node.target)){
                        var tabs = $("#tabs");
                        var tab = tabs.tabs("getTab",node.text);
                        if(tab){
                            tabs.tabs("select",node.text);
                        }else{
                            tabs.tabs('add',{
                                title:node.text,
                                href: node.attributes.url,
                                closable:true,
                                bodyCls:"content"
                            });
                        }
                    }
                }
            });
        });
    </script>
</head>

<body class="easyui-layout">
<!-- 头部标题 -->
<div data-options="region:'north',border:false" style="height:60px; padding:5px; background:#F3F3F3">
    <span class="northTitle">宜立方商城后台管理系统</span>
    <span class="loginInfo">登录用户：admin&nbsp;&nbsp;姓名：管理员&nbsp;&nbsp;角色：系统管理员</span>
</div>
<div data-options="region:'west',title:'菜单',split:true" style="width:180px;">

</div>

<div data-options="region:'center',title:''">
    <div id="tabs" class="easyui-tabs">
        <div title="首页" style="padding:20px;">

        </div>
    </div>
</div>
<!-- 页脚信息 -->
<div data-options="region:'south',border:false"
     style=" height:20px; background:#F3F3F3; padding:2px; vertical-align:middle;">
    <span id="sysVersion">系统版本：V1.0</span>
    <span id="nowTime"></span>
</div>

</body>
</html>