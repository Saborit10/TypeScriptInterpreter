var SegmentTree = /** @class */ (function () {
    function SegmentTree(n) {
        this.T = new Array();
        this.n = n;
        this.T = new Array(4 * n + 5);
        this.build(1, n, 1);
    }
    SegmentTree.prototype.build = function (x, xend, nod) {
        if (x == xend)
            return;
    };
    return SegmentTree;
}());
