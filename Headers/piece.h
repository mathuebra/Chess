class piece
{
private:
    char* name;
    struct position
    {
        char x;
        int y;
    } typedef position;
    enum color
    {
        white,
        black
    } typedef color;

protected:
    position pos;
    color clr;

    virtual void checkMove() = 0;
    virtual void capture() = 0;


public:
    piece(/* args */);
    ~piece();
};

piece::piece(/* args */)
{
}

piece::~piece()
{
}
