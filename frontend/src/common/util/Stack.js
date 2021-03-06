class Stack {
    constructor() {
        this.store = [];
    }

    push(item) {
        this.store.push(item);
    }

    pop() {
        return this.store.pop();
    }

    size() {
        return this.store.length;
    }

    clear() {
        this.store = [];
    }
}

export default Stack;