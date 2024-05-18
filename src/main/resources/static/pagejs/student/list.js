/*$(function() {
    $.ajax({
        url: "findAll",
        type: "GET",
        success: function (data) {
            var html=""
            for(var i=0;i<data.data.length;i++){
                var item=data.data[i];
                html+="<tr>"
                html+="<td>"+item.id
                    +"</td>";
                html+="<td>"+item.name
                    +"</td>" ;
                html+="</tr>";
            }
            $("#student").html(html);
            console.log(data.data)
        }
    });
});*/
/*$(function() {
    // 获取全部学生列表
    $.ajax({
        url: "findAll",
        type: "GET",
        success: function (data) {
            var html = "";
            for (var i = 0; i < data.data.length; i++) {
                var item = data.data[i];
                html += "<tr>"
                    + "<td>" + item.id + "</td>"
                    + "<td>" + item.name + "</td>"
                    // 添加其他字段
                    + "<td>"
                    + "<button onclick='editStudent(\"" + item.id + "\")'>编辑</button>"
                    + "<button onclick='deleteStudent(\"" + item.id + "\")'>删除</button>"
                    + "</td>"
                    + "</tr>";
            }
            $("#student").html(html);
            console.log(data.data);
        }
    });

    // 单条查询学生信息
    function findOneStudent(id) {
        $.ajax({
            url: "findOne/" + id,
            type: "GET",
            success: function (data) {
                // 处理返回的学生信息，例如填充到编辑表单或者展示到模态框中
            }
        });
    }

    // 编辑学生
    function editStudent(id) {
        // 调用单条查询接口获取学生信息
        findOneStudent(id);
        // 显示编辑模态框或者填充到编辑表单
    }

    // 删除学生
    function deleteStudent(id) {
        $.ajax({
            url: "delete?id=" + id, // 使用 query 参数传递 id
            type: "POST", // 或者使用 DELETE 方法，根据后端要求
            success: function (data) {
                // 删除成功后刷新页面或者更新学生列表
            }
        });
    }

    // 添加学生
    $("#addForm").submit(function (event) {
        event.preventDefault();
        var formData = $(this).serialize();
        $.ajax({
            url: "add", // 修改为添加接口的路径
            type: "POST",
            data: formData,
            success: function (data) {
                // 添加成功后刷新页面或者更新学生列表
            }
        });
    });
});*/

$(function() {
    // 获取全部学生列表
    $.ajax({
        url: "findAll",
        type: "GET",
        success: function (data) {
            var html = "";
            for (var i = 0; i < data.data.length; i++) {
                var item = data.data[i];
                html += "<tr>"
                    + "<td>" + item.id + "</td>"
                    + "<td>" + item.name + "</td>"
                    // 添加其他字段
                    + "<td>"
                    + "<button onclick='editStudent(\"" + item.id + "\")'>编辑</button>"
                    + "<button onclick='deleteStudent(\"" + item.id + "\")'>删除</button>"
                    + "</td>"
                    + "</tr>";
            }
            $("#studentBody").html(html);
            console.log(data.data);
        }
    });

    // 单条查询学生信息
    function findOneStudent(id) {
        $.ajax({
            url: "findOne/" + id,
            type: "GET",
            success: function (data) {
                // 处理返回的学生信息，例如填充到编辑表单或者展示到模态框中
            }
        });
    }

    // 编辑学生
    function editStudent(id) {
        // 调用单条查询接口获取学生信息
        findOneStudent(id);
        // 显示编辑模态框或者填充到编辑表单
    }

    // 删除学生
    function deleteStudent(id) {
        $.ajax({
            url: "delete?id=" + id, // 使用 query 参数传递 id
            type: "POST", // 或者使用 DELETE 方法，根据后端要求
            success: function (data) {
                // 删除成功后刷新页面或者更新学生列表
            }
        });
    }

    // 添加学生
    $("#addForm").submit(function (event) {
        event.preventDefault();
        var formData = $(this).serialize();
        $.ajax({
            url: "add", // 修改为添加接口的路径
            type: "POST",
            data: formData,
            success: function (data) {
                // 添加成功后刷新页面或者更新学生列表
            }
        });
    });
});

