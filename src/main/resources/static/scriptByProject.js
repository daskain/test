function generateArr() {
    var field = document.getElementById("generate-arr");
    var url = "./arr/generate/";
    var table = document.getElementById("table");
    if (table != null) {
        table.remove();
    }
    fetch(url)
        .then(function (response) {
            if (response.ok) {
                response.json().then(function (json) {
                    let table = '<table id="table" class="table">\n' +
                        '  <thead>\n' +
                        '    <tr>\n' +
                        '      <th scope="col">Id</th>\n' +
                        '      <th scope="col">Note</th>\n' +
                        '    </tr>\n' +
                        '  </thead>\n' +
                        '  <tbody>\n';
                        table +=
                            '<tr>\n' +
                            '    <th scope="row">' + json.id + '</th>\n' +
                            '    <td>' + json.resultArray + '</td>\n' +
                            '</tr>';

                    table += '  </tbody>\n' +
                        '</table>';
                    var list = document.createRange()
                        .createContextualFragment(table);
                    document.getElementById('main-block').after(list);
                })
            } else {
                response.json().then(function (json) {
                    alert(json.message + "\n");
                })
            }
        })
}

function getRecords() {
    var field = document.getElementById("get-all");
    var url = "./arr/get_all";
    var table = document.getElementById("table");
    if (table != null) {
        table.remove();
    }
    fetch(url)
        .then(function (response) {
            if (response.ok) {
                response.json().then(function (json) {
                    let table = '<table id="table" class="table">\n' +
                        '  <thead>\n' +
                        '    <tr>\n' +
                        '      <th scope="col">Id</th>\n' +
                        '      <th scope="col">Note</th>\n' +
                        '    </tr>\n' +
                        '  </thead>\n' +
                        '  <tbody>\n';
                    $.each(json, function (i, records) {
                        table +=
                            '<tr>\n' +
                            '    <th scope="row">' + records.id + '</th>\n' +
                            '    <td>' + records.resultArray + '</td>\n' +
                            '</tr>';
                    });

                    table += '  </tbody>\n' +
                        '</table>';
                    var list = document.createRange()
                        .createContextualFragment(table);
                    document.getElementById('main-block').after(list);
                })
            } else {
                response.json().then(function (json) {
                    alert(json.message + "\n");
                })
            }
        })
}