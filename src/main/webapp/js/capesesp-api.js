/* http://stackoverflow.com/questions/22084698/how-to-export-source-content-within-div-to-text-html-file */
function downloadInnerHtml(filename, elId, mimeType) {
    var elHtml = document.getElementById(elId).innerHTML;
    var link = document.createElement('a');
    mimeType = mimeType || 'text/plain';

    link.setAttribute('download', filename);
    link.setAttribute('href', 'data:' + mimeType  +  ';charset=utf-8,' + encodeURIComponent(elHtml));
    document.body.appendChild(link);
    link.click(); 
    document.body.removeChild(link);
}